/*
 * Copyright 2008-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package integration;

import griffon.core.GriffonApplication;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonModel;

import javax.annotation.Nonnull;
import javax.inject.Inject;

public class IntegrationModel extends AbstractGriffonModel {
    private String input;
    private String output;

    @Inject
    public IntegrationModel(@Nonnull GriffonApplication application) {
        super(application);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        firePropertyChange("input", this.input, this.input = input);
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        firePropertyChange("output", this.output, this.output = output);
    }
}