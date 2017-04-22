package Ex9;

class InstanceMethWithObjRefDemo {
	
    static <T> int counter(T[] vals, MyFunc<T> f, T v){
    	int count = 0;
    
    	for(int i = 0; i < vals.length ;i++){
    		if(f.func(vals[i],v)) count ++;
    	}
      return count;
    }
	
	public static void main(String[] args) {
		int count;
		
		HighTemp[] weekDayHighs = {
		     new HighTemp (19),new HighTemp (29),
		     new HighTemp (4),new HighTemp (69),
		     new HighTemp (89),new HighTemp (90)};
		
		//ClassName :: InstanceMethodName
		count = counter (weekDayHighs ,HighTemp::sameTemp, new HighTemp(89));
		
		HighTemp[] weekDayHighs2 = {
			     new HighTemp (29),new HighTemp (9),
			     new HighTemp (4),new HighTemp (39),
			     new HighTemp (79),new HighTemp (69)};
		
		//ClassName :: InstanceMethodName
		count = counter(weekDayHighs2 ,HighTemp::lessThanTemp ,new HighTemp(39));
		
		System.out.println(count + " day had a high of less than 19");
		
	}
	
	
	

}