package kodlamaio.hrms.core.utilities.result;

public class SuccessDataResult<T> extends DataResult<T>{

	public SuccessDataResult(T data, boolean success) {
		super(data, success);
	}
	
	public SuccessDataResult(T data) {
		super(data, true);
	}
	
	public SuccessDataResult(String message) {
		super(null, true, message);
	}
}
