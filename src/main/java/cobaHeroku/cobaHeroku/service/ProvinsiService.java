package cobaHeroku.cobaHeroku.service;

import java.util.List;

import cobaHeroku.cobaHeroku.dto.ProvinsiDto;
import cobaHeroku.cobaHeroku.entity.ProvinsiEntity;

public interface ProvinsiService {
	List<ProvinsiEntity> getAllProvinsi();
	ProvinsiEntity getProvinsiById(Integer idProvinsi);
	ProvinsiEntity insertProvinsi(ProvinsiDto dto);
	ProvinsiEntity updateProvinsi(ProvinsiDto dto, Integer idProvinsi);
	ProvinsiEntity deleteProvinsi(Integer idProvinsi);
	ProvinsiEntity softDeleteProvinsi(Integer idProvinsi);
}
