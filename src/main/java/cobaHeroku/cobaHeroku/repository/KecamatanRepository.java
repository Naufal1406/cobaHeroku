package cobaHeroku.cobaHeroku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cobaHeroku.cobaHeroku.entity.KecamatanEntity;

@Repository
public interface KecamatanRepository extends JpaRepository<KecamatanEntity, Integer>{
	KecamatanEntity findByKodeKecamatan(String kodeKecamatan);
}
