package unit;

import org.junit.Assert;
import org.junit.Test;

import adapter.SickAdapter;
import repository.MemoryRepository;
import repository.Repository;
import service.SickService;

public class SickAdapterTest {
	
	@Test
	public void saveSickAdapter(){
		//TODO: mock
		Repository sickRepository = new MemoryRepository();		
		SickService sickService = new SickService(sickRepository);
		SickAdapter sickAdapter = new SickAdapter(sickService);
		
		Assert.assertTrue(true);
	}
}