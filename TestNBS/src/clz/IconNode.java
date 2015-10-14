/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clz;

/**
 *
 * @author Hishan
 * @Date Sep 15, 2015
 */
public class IconNode {
        private String name;
        private String Icon;

        public IconNode(String name, String flagIcon) {
            this.name = name;
            this.Icon = flagIcon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return Icon;
        }

        public void setIcon(String Icon) {
            this.Icon = Icon;
        }
    }