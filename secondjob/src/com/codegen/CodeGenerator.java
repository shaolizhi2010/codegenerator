package com.codegen;

import com.codegen.action.ActionGenerator;
import com.codegen.dao.DaoGenerator;
import com.codegen.entity.EntityGenerator;
import com.codegen.jsp.JspForCreateGenerator;
import com.codegen.jsp.JspForListGenerator;
import com.codegen.jsp.JspForViewGenerator;
import com.codegen.service.ServiceGenerator;

public class CodeGenerator {

	public static void main(String[] args) {

		try {
			String moduleName = "resume";
			
			new EntityGenerator().gen(moduleName);
			new DaoGenerator().gen(moduleName);
			new ActionGenerator().gen(moduleName);
			new ServiceGenerator().gen(moduleName);
			new JspForCreateGenerator().gen(moduleName);
			new JspForListGenerator().gen(moduleName);
			new JspForViewGenerator().gen(moduleName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
 

}
