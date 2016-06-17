/*
 * $Id: ELMessageTagBeanInfo.java 54933 2004-10-16 17:04:52Z germuska $ 
 *
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.strutsel.taglib.bean;

import java.beans.PropertyDescriptor;
import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.beans.SimpleBeanInfo;

/**
 * This is the <code>BeanInfo</code> descriptor for the
 * <code>org.apache.strutsel.taglib.bean.ELMessageTag</code> class.  It is
 * needed to override the default mapping of custom tag attribute names to
 * class attribute names.
 */
public class ELMessageTagBeanInfo extends SimpleBeanInfo
{
    public  PropertyDescriptor[] getPropertyDescriptors()
    {
        ArrayList proplist = new ArrayList();

        try {
            proplist.add(new PropertyDescriptor("arg0", ELMessageTag.class,
                                                null, "setArg0Expr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("arg1", ELMessageTag.class,
                                                null, "setArg1Expr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("arg2", ELMessageTag.class,
                                                null, "setArg2Expr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("arg3", ELMessageTag.class,
                                                null, "setArg3Expr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("arg4", ELMessageTag.class,
                                                null, "setArg4Expr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("bundle", ELMessageTag.class,
                                                null, "setBundleExpr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("key", ELMessageTag.class,
                                                null, "setKeyExpr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("locale", ELMessageTag.class,
                                                null, "setLocaleExpr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("name", ELMessageTag.class,
                                                null, "setNameExpr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("property", ELMessageTag.class,
                                                null, "setPropertyExpr"));
        } catch (IntrospectionException ex) {}
        try {
            proplist.add(new PropertyDescriptor("scope", ELMessageTag.class,
                                                null, "setScopeExpr"));
        } catch (IntrospectionException ex) {}
        
        PropertyDescriptor[] result =
            new PropertyDescriptor[proplist.size()];
        return ((PropertyDescriptor[]) proplist.toArray(result));
    }
}
