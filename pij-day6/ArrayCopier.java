public class ArrayCopier{
	public void copy(int[]src, int[]dst){
		int x = 0;
		if (src.length > dst.length){
			x = dst.length;
		}else{
			x = src.length;
		}
		for (int i=0; i < x; i++){
			dst[i]=src[i];
		}
	}
}