package org.wanfan.showcase.common.utils.sitemesh3;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

/**
 * 可以参考TagRuleBundle的自带实现
 * @author andy
 *
 */
public class MySiteMesh3Tag  implements TagRuleBundle{

	@Override
	public void cleanUp(State state, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
	}

	@Override
	public void install(State state, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
		state.addRule("mySiteMesh3Tag", new ExportTagToContentRule(siteMeshContext, contentProperty.getChild("mySiteMesh3Tag"), false));		
	}

}
