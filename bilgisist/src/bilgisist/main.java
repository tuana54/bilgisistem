package bilgisist;

public class main {

	public static void main(String[] args) {
		teacher t1=new teacher("AyselHoca","5055999663","trh");
		
		course tarih=new course("tarih","101","trh");
		teacher t2=new teacher("grahambell","fzk","0000");
		teacher t3=new teacher("aslı","mat","0002");
		tarih.addTeacher(t1);
		
		course fizik=new course("fizik","102","fzk");
		fizik.addTeacher(t2);
		
		course mate=new course("matematik","103","mat");
		mate.addTeacher(t3);
		student s1=new student("tuana","220610031","2",tarih,fizik,mate);
		s1.addBulkExamNote(100, 60, 50);
		s1.isPass();
		
		
	}
	
}