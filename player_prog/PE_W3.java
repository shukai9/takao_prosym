//パターンを除去して精度を変えたZebra評価関数
//W3と呼称

class PE_W3 extends ZebraEv {
    
	@Override
	protected int evalSub(CoeffSet evtable) {
		int score = 0;
	int pattern0;

	pattern0 = board[82];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[12];
	    
	score += evtable.bfile[pattern0];
	    
	pattern0 = board[87];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[17];
	    
	score += evtable.bfile[pattern0];
	    
	pattern0 = board[28];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[21];
	    
	score += evtable.bfile[pattern0];

	pattern0 = board[78];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[71];

	score += evtable.bfile[pattern0];

	pattern0 = board[83];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[13];
	    
	score += evtable.cfile[pattern0];

	pattern0 = board[86];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[16];
	  
	score += evtable.cfile[pattern0];
	    
	pattern0 = board[38];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[31];
	    
	score += evtable.cfile[pattern0];

	pattern0 = board[68];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[61];
	    
	score += evtable.cfile[pattern0];

	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[14];
	    
	score += evtable.dfile[pattern0];

	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[15];

	score += evtable.dfile[pattern0];

	pattern0 = board[48];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[41];
	 
	score += evtable.dfile[pattern0];
  
	pattern0 = board[58];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[51];

	score += evtable.dfile[pattern0];
	    
	pattern0 = board[88];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[11];

	score += evtable.diag8[pattern0];
	    
	pattern0 = board[81];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[18];
	 
	score += evtable.diag8[pattern0];

	pattern0 = board[78];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[12];
	  
	score += evtable.diag7[pattern0];
	    
	pattern0 = board[87];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[21];

	score += evtable.diag7[pattern0];
	    
	pattern0 = board[71];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[17];
	    
	score += evtable.diag7[pattern0];
	    
	pattern0 = board[82];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[28];

	score += evtable.diag7[pattern0];
	    
	pattern0 = board[68];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[13];

	score += evtable.diag6[pattern0];
	    
	pattern0 = board[86];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[31];

	score += evtable.diag6[pattern0];
	    
	pattern0 = board[61];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[16];

	score += evtable.diag6[pattern0];
	    
	pattern0 = board[83];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[38];
	    
	score += evtable.diag6[pattern0];
	pattern0 = board[58];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[14];

	score += evtable.diag5[pattern0];
	    
	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[41];
	    
	score += evtable.diag5[pattern0];
	    
	pattern0 = board[51];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[15];
	    
	score += evtable.diag5[pattern0];
	    
	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[48];
	    
	score += evtable.diag5[pattern0];
	    
	pattern0 = board[48];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[15];

	score += evtable.diag4[pattern0];
	    
	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[51];

	score += evtable.diag4[pattern0];
	
	pattern0 = board[41];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[14];
	    
	score += evtable.diag4[pattern0];
	    
	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[58];
	    
	score += evtable.diag4[pattern0];
	    
	pattern0 = board[25];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[21];
	pattern0 = 3 * pattern0 + board[15];
	pattern0 = 3 * pattern0 + board[14];
	pattern0 = 3 * pattern0 + board[13];
	pattern0 = 3 * pattern0 + board[12];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += evtable.corner52[pattern0];
	    
	pattern0 = board[75];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[71];
	pattern0 = 3 * pattern0 + board[85];
	pattern0 = 3 * pattern0 + board[84];
	pattern0 = 3 * pattern0 + board[83];
	pattern0 = 3 * pattern0 + board[82];
	pattern0 = 3 * pattern0 + board[81];
	  
	score += evtable.corner52[pattern0];
	    
	pattern0 = board[24];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[28];
	pattern0 = 3 * pattern0 + board[14];
	pattern0 = 3 * pattern0 + board[15];
	pattern0 = 3 * pattern0 + board[16];
	pattern0 = 3 * pattern0 + board[17];
	pattern0 = 3 * pattern0 + board[18];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[74];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[78];
	pattern0 = 3 * pattern0 + board[84];
	pattern0 = 3 * pattern0 + board[85];
	pattern0 = 3 * pattern0 + board[86];
	pattern0 = 3 * pattern0 + board[87];
	pattern0 = 3 * pattern0 + board[88];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[52];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[12];
	pattern0 = 3 * pattern0 + board[51];
	pattern0 = 3 * pattern0 + board[41];
	pattern0 = 3 * pattern0 + board[31];
	pattern0 = 3 * pattern0 + board[21];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += evtable.corner52[pattern0];
	    
	pattern0 = board[57];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[17];
	pattern0 = 3 * pattern0 + board[58];
	pattern0 = 3 * pattern0 + board[48];
	pattern0 = 3 * pattern0 + board[38];
	pattern0 = 3 * pattern0 + board[28];
	pattern0 = 3 * pattern0 + board[18];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[42];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[82];
	pattern0 = 3 * pattern0 + board[41];
	pattern0 = 3 * pattern0 + board[51];
	pattern0 = 3 * pattern0 + board[61];
	pattern0 = 3 * pattern0 + board[71];
	pattern0 = 3 * pattern0 + board[81];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[47];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[87];
	pattern0 = 3 * pattern0 + board[48];
	pattern0 = 3 * pattern0 + board[58];
	pattern0 = 3 * pattern0 + board[68];
	pattern0 = 3 * pattern0 + board[78];
	pattern0 = 3 * pattern0 + board[88];

	score += evtable.corner52[pattern0];
	return score;
    }
}
