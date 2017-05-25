/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TouchableHighlight
} from 'react-native';

export default class app1 extends Component {
  constructor(props) {
    super(props);
    this.state = { counter: 0 };
  }

  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          App1
        </Text>
        <TouchableHighlight
          onPress={() => {
            this.setState({ counter: this.state.counter + 1 });
          }}
        >
          <Text style={{ color: 'black' }}>Press me: {this.state.counter}</Text>
        </TouchableHighlight>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F5FCFF'
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
    color: 'black'
  }
});

AppRegistry.registerComponent('app1', () => app1);
