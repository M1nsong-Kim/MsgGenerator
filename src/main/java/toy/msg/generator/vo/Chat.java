package toy.msg.generator.vo;

import lombok.Data;

@Data
public class Chat {
	private String from;
	private String to;
	private String content;
	private String time;
}
