package com.adobe.learning.core.models;

import lombok.Getter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;





@Getter
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DropdownMenuModel{
        
    @ValueMapValue(name="dropdown1")
    @Inject
    protected String dropdown1;

    @ValueMapValue(name="dropdown1Checkbox")
    @Inject
    protected Boolean dropdown1Checkbox;
    
    
    
            
    @ValueMapValue(name="dropdown3")
    @Inject
    protected String dropdown3;

    @ValueMapValue(name="dropdown3Checkbox")
    @Inject
    protected Boolean dropdown3Checkbox;
    
    
    
            
    @ValueMapValue(name="dropdown4")
    @Inject
    protected String dropdown4;

    @ValueMapValue(name="dropdown4Checkbox")
    @Inject
    protected Boolean dropdown4Checkbox;
    
    
    
            
    @ValueMapValue(name="dropdown5")
    @Inject
    protected String dropdown5;

    @ValueMapValue(name="dropdown5Checkbox")
    @Inject
    protected Boolean dropdown5Checkbox;
    
    
    
    
}

