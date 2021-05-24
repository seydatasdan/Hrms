package kodlamaio.hrms.core.utilities.result;

public class ErrorDataResult<T> extends DataResult<T> {
	
	public ErrorDataResult(T data, boolean success) {
		super(data, success);
	}
	
	public ErrorDataResult(T data) {
		super(data, false);
	}
	
	public ErrorDataResult(String message) {
		super(null, false, message);
	}
	
	public ErrorDataResult() {
		super(null,false);
	}
}
