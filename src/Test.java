import com.hankcs.hanlp.HanLP;

public class Test {
	public static void main(String args[]) {
		String fileDir = "D:/workspace/pinyin/HanLP-master";
		HanLP.Config.init(String.format("%s/dictionary/hanlp.properties", fileDir), fileDir);
		String pinyin = HanLP.convertToPinyinFirstCharString("重庆重工", "", true).toUpperCase();
		System.out.println(pinyin);
	}
}
