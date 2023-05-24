package toy.msg.generator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import toy.msg.generator.mapper.MainMapper;

@Service
@Transactional
public class MainService {
	@Autowired 
	MainMapper mappepr;
}
