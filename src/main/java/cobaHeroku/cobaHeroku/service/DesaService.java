package cobaHeroku.cobaHeroku.service;

import java.util.List;

import cobaHeroku.cobaHeroku.dto.DesaDto;
import cobaHeroku.cobaHeroku.entity.DesaEntity;

public interface DesaService {
	List<DesaEntity> getAllDesa();
	DesaEntity getDesaById(Integer idDesa);
	DesaEntity postDesa(DesaDto dto);
	DesaEntity updateDesa(DesaDto dto, Integer idDesa);
	DesaEntity deleteDesa(Integer idDesa);
}
