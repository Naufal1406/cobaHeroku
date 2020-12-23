package cobaHeroku.cobaHeroku.service;

import java.util.List;

import cobaHeroku.cobaHeroku.dto.KecamatanDto;
import cobaHeroku.cobaHeroku.entity.KecamatanEntity;


public interface KecamatanService {
	List<KecamatanEntity> getAllKecamatan();
	KecamatanEntity getKecamatanById(Integer idKecamatan);
	KecamatanEntity insertKecamatan(KecamatanDto dto);
	KecamatanEntity updateKecamatan(KecamatanDto dto, Integer idKecamatan);
	KecamatanEntity deleteKecamatan(Integer idKecamatan);
}
