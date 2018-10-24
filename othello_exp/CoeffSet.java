//Zebra評価関数のパラメータをファイルから読み込むクラス

import java.io.*;
import java.util.zip.GZIPInputStream;

class CoeffSet {
    
    int parity;
    int constant;
    int[] parity_constant;
    int[] afile2x, bfile, cfile, dfile;
    int[] diag8, diag7, diag6, diag5, diag4;
    int[] corner33, corner52;
    
    CoeffSet() {
	constant = 0;
	parity = 0;
	parity_constant = new int[2];
	afile2x  = new int[59049];
	bfile    = new int[6561];
	cfile    = new int[6561];
	dfile    = new int[6561];
	diag8    = new int[6561];
	diag7    = new int[2187];
	diag6    = new int[729];
	diag5    = new int[243];
	diag4    = new int[81];
	corner33 = new int[19683];
	corner52 = new int[59049];
    }
    
    //ファイルから配列へパラメータを書き込むメソッド
    static void readArrayFromFile(BufferedReader br, int[] array) throws Exception {
	    for (int i = 0; i < array.length; i++) {
		array[i] = Integer.parseInt(br.readLine());
	    }
    }
    
    //配列の各indexにパラメータを書き込むメソッド
    static CoeffSet readFromFile(int stage) throws Exception {
	CoeffSet ret = new CoeffSet();
	    String filename = String.format("coeffs_data/coeffs_%02d.txt.gz", stage);
	    BufferedReader br = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(new File(filename)))));
	    
	    br.readLine(); // constant:
	    ret.constant = Integer.parseInt(br.readLine());
	    
	    br.readLine(); // parity:
	    ret.parity = Integer.parseInt(br.readLine());
	    
	    br.readLine(); // parity_constant:
	    readArrayFromFile(br, ret.parity_constant);
	
	    br.readLine(); // afile2x:
	    readArrayFromFile(br, ret.afile2x);
	    
	    br.readLine(); // bfile:
	    readArrayFromFile(br, ret.bfile);
	    
	    br.readLine(); // cfile:
	    readArrayFromFile(br, ret.cfile);
	    
	    br.readLine(); // dfile:
	    readArrayFromFile(br, ret.dfile);
	    
	    br.readLine(); // diag8:
	    readArrayFromFile(br, ret.diag8);
	    
	    br.readLine(); // diag7:
	    readArrayFromFile(br, ret.diag7);
	    
	    br.readLine(); // diag6:
	    readArrayFromFile(br, ret.diag6);
	    
	    br.readLine(); // diag5:
	    readArrayFromFile(br, ret.diag5);
	    
	    br.readLine(); // diag4:
	    readArrayFromFile(br, ret.diag4);
	    
	    br.readLine(); // corner33:
	    readArrayFromFile(br, ret.corner33);
	    
	    br.readLine(); // corner52:
	    readArrayFromFile(br, ret.corner52);
	    
	    br.close();
	return ret;
    }
}
