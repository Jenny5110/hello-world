/*������������� ���� ���� ��� ���� ��� �� ������ ��� �����*/
/*���������� ��� �� lathosstofonien*/
public class lexpin {
	private String word; /*� ���� */ 
	private String [] warr; /* � ������� ��� ���� �� ���� */
 
	public lexpin (String word, String [] warr) {
		this.word = word;
		this.warr = warr;
	}
	
	public String getWord() {
		 return this.word;
	}
	
	public String [] getWarr() {
		return this.warr;
	}
	
}
