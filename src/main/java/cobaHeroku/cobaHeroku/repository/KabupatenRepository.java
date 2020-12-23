package cobaHeroku.cobaHeroku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cobaHeroku.cobaHeroku.entity.KabupatenEntity;

@Repository
public interface KabupatenRepository extends JpaRepository<KabupatenEntity, Integer> {
	KabupatenEntity findByKodeKabupaten(String kodeProvinsi);
}
