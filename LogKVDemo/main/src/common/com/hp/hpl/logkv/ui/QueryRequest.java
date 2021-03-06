package com.hp.hpl.logkv.ui;

public class QueryRequest extends Request {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 599507541236811967L;
	private long startTime;
	private long endTime;
	private String query;
	
	public QueryRequest(String query, long startTime, long endTime){
		this.startTime = startTime;
		this.endTime = endTime;
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public String toString() {
		return "QueryRequest [startTime=" + startTime + ", endTime=" + endTime + ", query=" + query + "]";
	}

	

}
