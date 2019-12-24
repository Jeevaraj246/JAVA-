class convertion {
	public static void main(String[]args) {
		String[] ref=new String[10];
		ref[0]="i";
		ref[1]="ii";
		ref[2]="iii";
		ref[3]="iv";
		ref[4]="v";
		ref[5]="vi";
		ref[6]="vii";
		ref[7]="viii";
		ref[8]="ix";
		ref[9]="x";
		for(int i=0;i<ref.length;i++) {
			if(i==7) {
				System.out.println(ref[i-1]);
			}
		}
	}
}
