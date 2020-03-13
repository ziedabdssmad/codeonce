package com.services;

import org.springframework.stereotype.Service;

@Service
public class CodeOnceServiceImpl implements CodeOnceSerivce {
	@Override
	public int NumbreOcc(String input) {
		int occurence = 0;
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case '.':
				occurence++;
				break;
			case ',':
				occurence++;
				break;
			case ';':
				occurence++;
				break;
			case ':':
				occurence++;
				break;
			case '!':
				occurence++;
				break;
			case '?':
				occurence++;
				break;
			}
		}
		return occurence;
	}

}
