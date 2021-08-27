package jp.co.sample.emp_management.form;

/**
 * 曖昧検索時に使用するフォーム.
 * 
 * @author izawamotoki
 * 
 */
public class findByNameLikeForm {
	/** 名前 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "findByNameLikeForm [name=" + name + "]";
	}

}
