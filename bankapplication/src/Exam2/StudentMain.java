package Exam2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Studentss>list=new ArrayList<Studentss>();
		Studentss s1=new Studentss("Elena",80);
		Studentss s2=new Studentss("Jeremy",78);
		Studentss s3=new Studentss("Damon",90);
		Studentss s4=new Studentss("Stefen",20);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("students who are passed:");
	Predicate<Studentss>p=s->s.marks>=40;
	Function<Studentss,String>f=stu->{
		int m=stu.marks;
		if(m>=80)
			return "Distinction";
		else if(m>=60 && m<=79)
			return "FirsT Class";
		else if(m>=40 && m<=50)
			return "Second class";
		else
			return "fail";
	};
	Consumer<Studentss>c=s->{
		
		System.out.print(s.name+"  ");
		System.out.println(f.apply(s));
	};
	for(Studentss s:list) {
		if(p.test(s))
		{
			c.accept(s);
		}
			
	}
	}

}
