/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.client.toolbar;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.drools.guvnor.client.mvp.StaticScreenService;

import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class AssetEditorActionToolbarPresenter
    implements
    StaticScreenService {

    public interface View
        extends
        IsWidget {
    }

    @Inject
    View view;

    public AssetEditorActionToolbarPresenter() {
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onClose() {
    }

    @Override
    public boolean mayClose() {
        return true;
    }

    @Override
    public boolean mayHide() {
        return true;
    }

    @Override
    public void onReveal() {
    }

    @Override
    public void onHide() {
    }

}
