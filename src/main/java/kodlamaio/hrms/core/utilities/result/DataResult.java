package kodlamaio.hrms.core.utilities.result;

public class DataResult<T> extends Result { //mesaj ve success bilgisi burada da istendiği için resukt ile extends ettik
//birden fazla veri tipi ile çalışabileceğimiz için generic ile çalışıyoruz <T>
	
	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}  	
	
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	} 
	
	public T getData() {
		return this.data;
	}
}
