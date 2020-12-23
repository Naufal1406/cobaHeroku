package cobaHeroku.cobaHeroku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cobaHeroku.cobaHeroku.dto.KecamatanDto;
import cobaHeroku.cobaHeroku.entity.KabupatenEntity;
import cobaHeroku.cobaHeroku.entity.KecamatanEntity;
import cobaHeroku.cobaHeroku.entity.ProvinsiEntity;
import cobaHeroku.cobaHeroku.repository.KabupatenRepository;
import cobaHeroku.cobaHeroku.repository.KecamatanRepository;
import cobaHeroku.cobaHeroku.repository.ProvinsiRepository;

@Service
@Transactional
public class KecamatanServiceImpl implements KecamatanService{
	@Autowired
	private KecamatanRepository kecamatanRepository;
	@Autowired
	private ProvinsiRepository provinsiRepository;
	@Autowired
	private KabupatenRepository kabupatenRepository;
	
	@Override
	public List<KecamatanEntity> getAllKecamatan() {
		// TODO Auto-generated method stub
		List<KecamatanEntity> kecamatanEntities = kecamatanRepository.findAll();
		return kecamatanEntities;
	}

	@Override
	public KecamatanEntity getKecamatanById(Integer idKecamatan) {
		// TODO Auto-generated method stub
		KecamatanEntity kecamatanEntity = kecamatanRepository.findById(idKecamatan).get();
		return kecamatanEntity;
	}


	@Override
	public KecamatanEntity insertKecamatan(KecamatanDto dto) {
		// TODO Auto-generated method stub
		ProvinsiEntity provinsiEntity = provinsiRepository.findByKodeProvinsi(dto.getKodeProvinsi());
		KabupatenEntity kabupatenEntity = kabupatenRepository.findByKodeKabupaten(dto.getKodeKabupaten());

		KecamatanEntity kecamatanEntity = convertToKecamatanEntity(dto);
		kecamatanEntity.setProvinsiEntity(provinsiEntity);
		kecamatanEntity.setKabupatenEntity(kabupatenEntity);
		kecamatanRepository.save(kecamatanEntity);
		return kecamatanEntity;
	}

	@Override
	public KecamatanEntity updateKecamatan(KecamatanDto dto, Integer idKecamatan) {
		// TODO Auto-generated method stub
		KecamatanEntity kecamatanEntity = kecamatanRepository.findById(idKecamatan).get();
		kecamatanEntity.setNamaKecamatan(dto.getNamaKecamatan());
		kecamatanEntity.setKodeKecamatan(dto.getKodeKecamatan());
		kecamatanRepository.save(kecamatanEntity);
		return kecamatanEntity;
	}

	@Override
	public KecamatanEntity deleteKecamatan(Integer idKecamatan) {
		// TODO Auto-generated method stub
		KecamatanEntity kecamatanEntity = kecamatanRepository.findById(idKecamatan).get();
		kecamatanRepository.delete(kecamatanEntity);
		return kecamatanEntity;
	}

	public KecamatanEntity convertToKecamatanEntity(KecamatanDto dto) {
		KecamatanEntity kecamatanEntity = new KecamatanEntity();
		kecamatanEntity.setNamaKecamatan(dto.getNamaKecamatan());
		kecamatanEntity.setKodeKecamatan(dto.getKodeKecamatan());
		return kecamatanEntity;
	}










}
