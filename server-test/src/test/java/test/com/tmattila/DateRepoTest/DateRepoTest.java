package test.com.tmattila.DateRepoTest;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tmattila.App;
import com.tmattila.model.DateStorageModel;
import com.tmattila.repository.DateRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class DateRepoTest {

	@Autowired
	DateRepository repo;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		System.out.println("Start test");
		Date date = new Date();
		DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String formattedDate = dateF.format(date);
		Assert.assertNotNull(repo.save(new DateStorageModel("TEST", formattedDate)));
		System.out.println(formattedDate);
		System.out.println("Test complete");
		System.out.println("Close test");
	}

}
