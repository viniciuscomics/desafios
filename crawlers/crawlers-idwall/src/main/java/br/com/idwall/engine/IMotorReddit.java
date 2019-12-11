package br.com.idwall.engine;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import br.com.idwall.model.TrendingTopicsReddit;

public interface IMotorReddit {

	public Map<String,List<TrendingTopicsReddit>> getTopThreadsReddit(List<String> links) throws MalformedURLException, IOException;

}
