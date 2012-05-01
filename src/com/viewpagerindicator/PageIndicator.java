/*
 * Copyright (C) 2011 Patrik Akerfeldt
 * Copyright (C) 2011 Jake Wharton
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

package com.viewpagerindicator;

/**
 * A PageIndicator is responsible to show an visual indicator on the total views
 * number and the current visible view.
 */
public interface PageIndicator extends ExtendedViewPager.OnPageChangeListener {

	/**
	 * Notify the indicator that the fragment list has changed.
	 */
	public void notifyDataSetChanged();

	/**
	 * <p>
	 * Set the current page of both the ViewPager and indicator.
	 * </p>
	 * 
	 * <p>
	 * This <strong>must</strong> be used if you need to set the page before the
	 * views are drawn on screen (e.g., default start page).
	 * </p>
	 * 
	 * @param item
	 */
	public void setCurrentItem(int item);

	/**
	 * Set a page change listener which will receive forwarded events.
	 * 
	 * @param listener
	 */
	public void setOnPageChangeListener(ExtendedViewPager.OnPageChangeListener listener);

	public void setPagingEnabled(boolean allow_change);

	/**
	 * Bind the indicator to a ViewPager.
	 * 
	 * @param view
	 */
	public void setViewPager(ExtendedViewPager pager);

	/**
	 * Bind the indicator to a ViewPager.
	 * 
	 * @param view
	 * @param initialPosition
	 */
	public void setViewPager(ExtendedViewPager pager, int initialPosition);
}
