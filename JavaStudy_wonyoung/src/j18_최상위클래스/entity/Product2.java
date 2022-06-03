package j18_최상위클래스.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor // 매개변수가 다 있는 생성자(전체생성자)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product2 {
	@NonNull
	private int productCode;
	@NonNull
	private String productName;
	private int category;
	private LocalDate productionDate;

}
