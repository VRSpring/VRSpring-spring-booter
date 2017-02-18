package com.vrspring.web.sao;

import com.alibaba.media.MediaDir;

import java.util.List;

public interface TaeBcFileSAO
{
	public List<MediaDir> getDirs(String soursDir, int pageNum, int pageSize);
}
