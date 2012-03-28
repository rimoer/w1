package com.wyz.dao.template.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wyz.dao.template.TemplateDao;
import com.wyz.entity.Template;
import com.wyz.entity.TemplateExample;
import com.wyz.mapper.TemplateMapper;

/**
 * @author wangyz
 * @since 2012-3-13 下午11:43:07
 * @version 1.0
 */

@Repository
public class TemplateDaoImpl implements TemplateDao {
	TemplateMapper templateMapper = null;

	public int countByExample(TemplateExample example) {
		return templateMapper.countByExample(example);
	}

	public int insert(Template record) {
		return templateMapper.insert(record);
	}

	public int deleteByPrimaryKey(Long id) {
		return templateMapper.deleteByPrimaryKey(id);
	}

	public int deleteByExample(TemplateExample example) {
		return templateMapper.deleteByExample(example);
	}

	public int updateByPrimaryKey(Template record) {
		return templateMapper.updateByPrimaryKey(record);
	}

	public int updateByExample(Template record, TemplateExample example) {
		return templateMapper.updateByExample(record, example);
	}

	public Template selectByPrimaryKey(Long id) {
		return templateMapper.selectByPrimaryKey(id);
	}

	public List<Template> selectByExample(TemplateExample example) {
		return templateMapper.selectByExample(example);
	}

	public TemplateMapper getTemplateMapper() {
		return templateMapper;
	}

	public void setTemplateMapper(TemplateMapper templateMapper) {
		this.templateMapper = templateMapper;
	}

}
