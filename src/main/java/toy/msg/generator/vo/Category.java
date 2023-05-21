package toy.msg.generator.vo;

import lombok.Data;

@Data
public class Category {
	private String categoryName;
	private int parentNo;
	private int geoupNo;
	private int depth;
	private int sequence;
}
