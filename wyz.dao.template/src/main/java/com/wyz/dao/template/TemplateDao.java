package com.wyz.dao.template;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.wyz.entity.Template;
import com.wyz.entity.TemplateExample;

/**
 * @author wangyz
 * @since 2012-3-13 下午11:42:48
 * @version 1.0
 */

public interface TemplateDao {
	@Transactional
	int insert(Template record);

	@Transactional
	int deleteByPrimaryKey(Long id);

	@Transactional
	int deleteByExample(TemplateExample example);

	@Transactional
	int updateByPrimaryKey(Template record);

	@Transactional
	int updateByExample(Template record, TemplateExample example);

	@Transactional(readOnly = true)
	int countByExample(TemplateExample example);

	@Transactional(readOnly = true)
	Template selectByPrimaryKey(Long id);

	@Transactional(readOnly = true)
	List<Template> selectByExample(TemplateExample example);

}
