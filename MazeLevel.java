package srinibash_game;

public class MazeLevel {
	private static final char LEVEL1[][]={{'#','#','#','#','#','#','#','#','#','#','#','#'},//0
			 {'#',' ',' ',' ','#',' ',' ',' ',' ',' ',' ','#'},//1
			 {' ',' ','#',' ','#',' ','#','#','#','#',' ','#'},//2
			 {'#','#','#',' ','#',' ',' ',' ',' ','#',' ','#'},//3
			 {'#',' ',' ',' ',' ','#','#','#',' ','#',' ',' '},//4
			 {'#','#','#','#',' ','#',' ','#',' ','#',' ','#'},//5
			 {'#',' ',' ','#',' ','#',' ','#',' ','#',' ','#'},//6
			 {'#','#',' ','#',' ','#',' ','#',' ','#',' ','#'},//7
			 {'#',' ',' ',' ',' ',' ',' ',' ',' ','#',' ','#'},//8
			 {'#','#','#','#','#','#',' ','#','#','#',' ','#'},//9
			 {'#',' ',' ',' ',' ',' ',' ','#',' ',' ',' ','#'},//10
			 {'#','#','#','#','#','#','#','#','#','#','#','#'}};//11
private static final int SROW=2,SCOL=0,EROW=4,ECOL=11,L1ROWLIMIT=12,L1COLLIMIT=12;
public static char[][] getLevel1() {
return LEVEL1;
}
public static int getL1rowlimit() {
return L1ROWLIMIT;
}
public static int getL1collimit() {
return L1COLLIMIT;
}
public static int getSrow() {
return SROW;
}

public static int getScol() {
return SCOL;
}

public static int getErow() {
return EROW;
}

public static int getEcol() {
return ECOL;
}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
private static final char LEVEL2[][]={{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ','#'}//0 
,{'#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ',' ',' ','#',' ','#'}//1 
,{'#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ',' ',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#'}//2
,{'#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ','#'}//3
,{'#',' ','#',' ','#',' ','#',' ','#','#','#',' ','#','#','#',' ','#',' ','#','#','#',' ','#','#','#','#','#','#','#',' ','#',' ','#',' ','#',' ','#'}//4
,{'#',' ','#',' ','#',' ','#',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ','#',' ','#'}//5
,{'#',' ','#',' ','#',' ','#','#','#','#','#','#','#','#','#','#','#','#','#',' ','#','#','#','#','#','#','#',' ','#','#','#','#','#','#','#',' ','#'}//6
,{'#',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#'}//7
,{'#',' ','#','#','#',' ','#',' ','#',' ','#','#','#','#','#','#','#',' ','#','#','#','#','#','#','#',' ','#',' ','#',' ','#',' ','#','#','#','#','#'}//8
,{'#',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ','#',' ',' ',' ',' ',' ','#'}//9
,{'#',' ','#','#','#',' ','#',' ','#','#','#','#','#',' ','#',' ','#','#','#','#','#','#','#',' ','#',' ','#','#','#',' ','#','#','#','#','#',' ','#'}//10
,{'#',' ',' ',' ','#',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ','#'}//11
,{'#','#','#','#','#','#','#','#','#','#','#',' ','#',' ','#',' ','#',' ','#','#','#',' ','#',' ','#','#','#','#','#','#','#','#','#',' ','#',' ','#'}//12
,{'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ',' ',' ','#',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ','#'}//13
,{'#',' ','#',' ','#','#','#','#','#','#','#','#','#',' ','#',' ','#','#','#',' ','#',' ','#','#','#','#','#','#','#',' ','#',' ','#',' ','#',' ','#'}//14
,{'#',' ','#',' ','#',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ',' ',' ','#',' ','#'}//15
,{'#',' ','#',' ','#',' ','#','#','#','#','#','#','#','#','#',' ','#',' ','#','#','#','#','#','#','#',' ','#',' ','#',' ','#',' ','#','#','#',' ','#'}//16
,{'#',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ','#',' ',' ',' ','#'}//17
,{'#','#','#',' ','#','#','#',' ','#',' ','#',' ','#',' ','#','#','#','#','#',' ','#',' ','#','#','#','#','#',' ','#',' ','#','#','#',' ','#','#','#'}//18
,{'#',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#'}//19
,{'#',' ','#',' ','#','#','#','#','#',' ','#',' ','#','#','#','#','#',' ','#',' ','#','#','#',' ','#',' ','#',' ','#','#','#',' ','#','#','#',' ','#'}//20
,{'#',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#'}//21
,{'#',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'}};//22
private static final int LEVEL2SROW=22,LEVEL2SCOL=1,LEVEL2EROW=0,LEVEL2ECOL=35,L2ROWLIMIT=23,L2COLLIMIT=37;

public static char[][] getLevel2() {
return LEVEL2;
}
public static int getLevel2srow() {
return LEVEL2SROW;
}
public static int getLevel2scol() {
return LEVEL2SCOL;
}
public static int getLevel2erow() {
return LEVEL2EROW;
}
public static int getLevel2ecol() {
return LEVEL2ECOL;
}
public static int getL2rowlimit() {
return L2ROWLIMIT;
}
public static int getL2collimit() {
return L2COLLIMIT;
}
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public static final char LEVEL3[][]={{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'}//0
,{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ','#'}//1
,{'#','#','#','#','#','#','#','#','#',' ','#',' ','#',' ','#','#','#',' ','#',' ','#','#','#'}//2
,{'#',' ',' ',' ','#',' ',' ',' ','#',' ','#',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#'}//3
,{'#',' ','#',' ','#',' ','#',' ','#',' ','#','#','#',' ','#',' ','#','#','#',' ','#',' ','#'}//4
,{'#',' ','#',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ','#',' ',' ',' ','#',' ','#'}///5
,{'#',' ','#','#','#',' ','#','#','#','#','#',' ','#','#','#',' ','#','#','#',' ','#',' ','#'}//6
,{'#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ',' ',' ','#',' ','#'}//7
,{'#',' ','#','#','#','#','#',' ','#','#','#','#','#',' ','#',' ','#',' ','#','#','#',' ','#'}//8
,{'#',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ','#'}//9
,{'#',' ','#','#','#','#','#',' ','#',' ','#','#','#','#','#','#','#',' ','#',' ','#','#','#'}//10
,{'#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#'}//11
,{'#','#','#',' ','#','#','#','#','#',' ','#','#','#','#','#','#','#',' ','#','#','#',' ','#'}//12
,{'#',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ','#'}//13
,{'#',' ','#',' ','#','#','#',' ','#','#','#',' ','#',' ','#','#','#','#','#','#','#',' ','#'}//14
,{'#',' ',' ',' ','#',' ',' ',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#'}//15
,{'#',' ','#','#','#','#','#',' ','#',' ','#','#','#','#','#',' ','#',' ','#',' ','#',' ','#'}//16
,{'#',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ','#',' ','#',' ','#'}//17
,{'#','#','#',' ','#',' ','#','#','#','#','#',' ','#','#','#','#','#',' ','#',' ','#','#','#'}//18
,{'#',' ','#',' ','#',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ','#'}//19
,{'#',' ','#',' ','#',' ','#',' ','#','#','#','#','#',' ','#',' ','#','#','#','#','#',' ','#'}//20
,{'#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#'}//21
,{'#',' ','#','#','#','#','#','#','#',' ','#',' ','#','#','#',' ','#','#','#',' ','#',' ','#'}//22
,{'#',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ','#'}//23
,{'#',' ','#','#','#',' ','#','#','#','#','#','#','#',' ','#','#','#','#','#',' ','#','#','#'}//24
,{'#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#'}//25
,{'#','#','#',' ','#',' ','#','#','#','#','#','#','#',' ','#',' ','#','#','#','#','#',' ','#'}//26
,{'#',' ',' ',' ','#',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ','#',' ','#'}//27
,{'#',' ','#','#','#',' ','#',' ','#',' ','#','#','#','#','#',' ','#','#','#','#','#',' ','#'}//28
,{'#',' ','#',' ',' ',' ','#',' ','#',' ','#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ','#'}//29
,{'#',' ','#',' ','#','#','#',' ','#','#','#',' ','#','#','#','#','#',' ','#','#','#',' ','#'}//30
,{'#',' ','#',' ',' ',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ','#',' ','#',' ','#'}//31
,{'#',' ','#',' ','#','#','#',' ','#',' ','#','#','#',' ','#',' ','#',' ','#',' ','#',' ','#'}//32
,{'#',' ',' ',' ','#',' ',' ',' ','#',' ','#',' ','#',' ','#',' ',' ',' ','#',' ',' ',' ','#'}//33
,{'#','#','#',' ','#',' ','#','#','#',' ','#',' ','#',' ','#','#','#','#','#','#','#','#','#'}//34
,{'#',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}//35
,{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'}};//36
private static final int LEVEL3SROW=1,LEVEL3SCOL=0,LEVEL3EROW=35,LEVEL3ECOL=22,L3ROWLIMIT=37,L3COLLIMIT=23;
public static char[][] getLevel3() {
return LEVEL3;
}
public static int getLevel3srow() {
return LEVEL3SROW;
}
public static int getLevel3scol() {
return LEVEL3SCOL;
}
public static int getLevel3erow() {
return LEVEL3EROW;
}
public static int getLevel3ecol() {
return LEVEL3ECOL;
}
public static int getL3rowlimit() {
return L3ROWLIMIT;
}
public static int getL3collimit() {
return L3COLLIMIT;
}
}
