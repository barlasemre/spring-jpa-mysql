package com.wagawin.domain;

import java.util.Random;

public enum HouseType {
	FLAT,HOUSE,ESTATE;
	
	public static HouseType getRandomHouseType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
