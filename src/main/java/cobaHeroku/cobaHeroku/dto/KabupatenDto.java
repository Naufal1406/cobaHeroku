package cobaHeroku.cobaHeroku.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KabupatenDto {
	private Integer id;
	private String namaKabupaten;
	private String kodeKabupaten;
	private String kodeProvinsi;
}
