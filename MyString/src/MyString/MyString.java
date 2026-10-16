package MyString;

public class MyString {
	private int size;
	private int capacity;
	private char [] buffer;
	private int initialCapacity;
	
	public MyString() {
		this.buffer = new char[this.capacity];
		this.capacity = 16;
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	 public char charAt(int index) {
		 return this.buffer[index];
	 }
	 public void set(char ch, int index) {
		 this.buffer[index]=ch;
	 }
	public MyString(String str) {
		if(str == null) {
			this.buffer = new char[16];
			this.size = 0;
		}else {
			int len = str.length();
			int initailCapacity = (len > 16) ? len:16;
			
			this.buffer = new char[initialCapacity];
			this.size = len;
			
			int i;
			for(i = 0;i < len; i++) {
				this.buffer[i] = str.charAt(i);
				
			}
		}
	}
	public MyString (int capacity) {
		if (capacity < 1) {
			capacity = 16;
		}
		this.buffer = new char[capacity];
		this.size = 0;
	}
	public void append(char c) {
		int resize;
		
		if (size >= buffer.length) {
			resize(buffer.length * 2);
		}
		buffer[size] = c;
		size++;
		
	}
	private void resize(int i) {
		char [] newArray = new char[capacity * 2];
		
		for (i = 0;i < )
			
		buffer = newArray;
	}
	
}


