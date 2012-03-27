package com.wyz.dao.template;

import java.util.List;

import com.wyz.entity.Template;
import com.wyz.entity.TemplateExample;

/**
 * @author wangyz
 * @since 2012-3-13 下午11:42:48
 * @version 1.0
 */

public interface TemplateDao {
	int countByExample(TemplateExample example);

	int insert(Template record);

	int deleteByPrimaryKey(Long id);

	int deleteByExample(TemplateExample example);

	int updateByPrimaryKey(Template record);

	int updateByExample(Template record, TemplateExample example);

	Template selectByPrimaryKey(Long id);

	List<Template> selectByExample(TemplateExample example);

}
