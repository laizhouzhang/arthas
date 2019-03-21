package com.taobao.arthas.plugin;

/**
 *
 * @author hengyunabc 2019-02-27
 *
 */
public interface Plugin {

    void init() throws PluginException;

    void start() throws PluginException;

    void stop() throws PluginException;

    PluginState state();

    String getName();
}