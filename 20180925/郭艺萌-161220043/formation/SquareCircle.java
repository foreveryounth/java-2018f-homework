﻿package formation;

import creature.*;
import map.*;

//（2,16） 缺少判断
public class SquareCircle implements Formation{
	@Override
	public void form(Map map, Creature[] creatures, int x, int y) {
		creatures[0].move(map.getPos()[x][y]);
		creatures[0].move(map.getPos()[x+1][y+1]);
		creatures[0].move(map.getPos()[x+2][y+2]);
		creatures[0].move(map.getPos()[x+3][y+1]);
		creatures[0].move(map.getPos()[x+4][y]);
		creatures[0].move(map.getPos()[x+3][y-1]);
		creatures[0].move(map.getPos()[x+2][y-2]);
		creatures[0].move(map.getPos()[x+1][y-1]);
	}
	@Override
	public void loose(Map map, Creature[] creatures, int x, int y) {
		map.getPos()[x][y].removeCrearure();
		map.getPos()[x+1][y+1].removeCrearure();
		map.getPos()[x+2][y+2].removeCrearure();
		map.getPos()[x+3][y+1].removeCrearure();
		map.getPos()[x+4][y].removeCrearure();
		map.getPos()[x+3][y-1].removeCrearure();
		map.getPos()[x+2][y-2].removeCrearure();
		map.getPos()[x+1][y-1].removeCrearure();
	}
}

