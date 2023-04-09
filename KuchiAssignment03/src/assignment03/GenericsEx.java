package assignment03;

public class GenericsEx<T> {
	
	private T value;

	public GenericsEx(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericsEx<String> stringExample = new GenericsEx<>("Generic Example");
        System.out.println(stringExample.getValue());

        GenericsEx<Integer> integerExample = new GenericsEx<>(555080);
        System.out.println(integerExample.getValue());

	}

}
