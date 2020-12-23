package cobaHeroku.cobaHeroku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cobaHeroku.cobaHeroku.entity.ProvinsiEntity;

@Repository
public interface ProvinsiRepository extends JpaRepository<ProvinsiEntity, Integer> {
	ProvinsiEntity findByKodeProvinsi(String kodeProvinsi);
}