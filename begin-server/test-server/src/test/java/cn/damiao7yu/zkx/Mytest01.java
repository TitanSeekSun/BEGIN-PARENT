package cn.damiao7yu.zkx;


import java.security.Key;
import java.util.HashMap;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Mytest01 {
	
	public static void main(String[] args) {
		Key key = new SecretKeySpec("miyao".getBytes(), SignatureAlgorithm.HS512.getJcaName());
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("header1","header1");
		String payload = "{\"user_id\":\"1341137\", \"expire_time\":\"2018-01-01 0:00:00\"}";
		String compact = Jwts.builder().setHeader(hashMap).setPayload(payload).signWith(SignatureAlgorithm.HS512, key).compact();
		
		System.out.println(compact);
		
		Jws<Claims> claimsJws = Jwts.parser().setSigningKey(key).parseClaimsJws(compact);
		JwsHeader header = claimsJws.getHeader();
		Claims body = claimsJws.getBody();

		System.out.println("jwt header:" + header);
		System.out.println("jwt body:" + body);
		System.out.println("jwt body user-id:" + body.get("user_id", String.class));
		
		
		
	}

}
