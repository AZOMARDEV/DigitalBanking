package org.sid.ebankingbackend.dtos;

import lombok.Data;

@Data
public class LoginReq {
	private String username;
	private String pwd;
}
