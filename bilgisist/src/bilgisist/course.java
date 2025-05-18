package bilgisist;

public class course {
	teacher courseTeacher;
	String name;
	String code;
	String prefix;
	int note;
	
	course(String name,String code,String prefix){
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
	}
	
	void addTeacher(teacher courseTeacher) {
		if(courseTeacher.branch.equals(this.prefix)) {
			this.courseTeacher=courseTeacher;
		}else {
			System.out.println("öğretmen ve ders bölümleri uyuşmuyor");
		}
		
	}
	void printTeacherinfo(){
		this.courseTeacher.print();
	}
}
