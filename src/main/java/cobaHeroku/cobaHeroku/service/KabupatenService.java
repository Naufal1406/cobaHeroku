package cobaHeroku.cobaHeroku.service;

import java.util.List;

import cobaHeroku.cobaHeroku.dto.KabupatenDto;
import cobaHeroku.cobaHeroku.entity.KabupatenEntity;

public interface KabupatenService {
	List<KabupatenEntity> getAllKabupaten();
	KabupatenEntity getKabupatenId(Integer idKabupaten);
	KabupatenEntity insertKabupaten(KabupatenDto dto);
	KabupatenEntity updateKabupaten(KabupatenDto dto, Integer idKabupaten);
	KabupatenEntity deleteKabupaten(Integer idKabupaten);
}
