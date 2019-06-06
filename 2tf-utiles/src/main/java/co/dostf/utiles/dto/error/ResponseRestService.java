package co.dostf.utiles.dto.error;

import java.io.Serializable;
import java.util.List;

public class ResponseRestService<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	// Variables usuadas para el envio de objetos en el caso que sea Extiso
	private T object;
	private List<T> listObject;
	private T[] vectorObject;
	private Integer code;

	private String method;
	private String uri;
	private String user;
	private String message;
	private String developerMessage;

	public ResponseRestService(T object) {
		super();
		this.object = object;
		this.code = 1;
	}

	public ResponseRestService(List<T> listObject) {
		super();
		this.listObject = listObject;
		this.code = 1;
	}

	public ResponseRestService(T[] vectorObject) {
		super();
		this.vectorObject = vectorObject;
	}

	public ResponseRestService(String method, String uri, String user, String message) {
		super();
		this.method = method;
		this.uri = uri;
		this.user = user;
		this.message = message;
		this.code = 2;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public List<T> getListObject() {
		return listObject;
	}

	public void setListObject(List<T> listObject) {
		this.listObject = listObject;
	}

	public T[] getVectorObject() {
		return vectorObject;
	}

	public void setVectorObject(T[] vectorObject) {
		this.vectorObject = vectorObject;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

}
