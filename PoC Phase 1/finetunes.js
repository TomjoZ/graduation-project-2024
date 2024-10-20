const fs = require('fs');
const { OpenAI } = require('openai');
const Anthropic = require("@anthropic-ai/sdk");
const axios = require('axios');
const { Mistral } = require("@mistralai/mistralai");


const promptset = '../Promptset1_finetunes/Prompt4';
const prompt = fs.readFileSync(promptset + '/Prompt.md', 'utf-8');


async function getResponseGPT4o() {
  try {
    const startTime = Date.now();
    const response = await openai.chat.completions.create({
      model: 'ft:gpt-4o-2024-08-06:personal:experiment1-2-dataset1:AK9YYtwN',
      messages: [
          {
                content: 'You are a code conversion assistant. Attribute with the correct attributes and return ONLY full html, no truncation (so including repetitive content) and nothing else. Attributes: textfield-[varName], textarea-[varName], list-[varName], img-[varName], link-[varName], checkbox-[varName], description="[description]."',
              role: "system"
          },
          { role: 'user', content: prompt }],
    });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content = response.choices[0].message.content;

    fs.writeFile(promptset + '/responses/response_GPT4o.html', content, (err) => {
      if (err) throw err;
      console.log('GPT4o finetuned response saved to response_GPT4o.html');
      console.log(`GPT4o finetuned response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching OpenAI response:', error.message);
  }
}
async function getResponseGPT4omini() {
  try {
    const startTime = Date.now();
    const response = await openai.chat.completions.create({
      model: 'ft:gpt-4o-mini-2024-07-18:personal:experiment1-2-dataset1:AK96VaIk',
      messages: [
          {
                content: 'You are a code conversion assistant. Attribute with the correct attributes and return ONLY full html, no truncation (so including repetitive content) and nothing else. Attributes: textfield-[varName], textarea-[varName], list-[varName], img-[varName], link-[varName], checkbox-[varName], description="[description]."',
              role: "system"
          },
          { role: 'user', content: prompt }],
    });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content = response.choices[0].message.content;

    fs.writeFile(promptset + '/responses/response_GPT4omini.html', content, (err) => {
      if (err) throw err;
      console.log('GPT4o-mini finetuned response saved to response_GPT4omini.html');
      console.log(`GPT4o-mini finetuned response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching OpenAI response:', error.message);
  }
}

async function getResponseMistral7B() {
  try {
    const startTime = Date.now();
    const response = await mistral.chat.complete({
        model: "ft:open-mistral-7b:229c75b9:20241019:ce30be5c",
        messages: [
            {
                content: 'You are a code conversion assistant. Attribute with the correct attributes and return ONLY full html, no truncation (so including repetitive content) and nothing else. Attributes: textfield-[varName], textarea-[varName], list-[varName], img-[varName], link-[varName], checkbox-[varName], description="[description]."',
                role: "system",
            },
          {
            content: prompt,
            role: "user",
          },
        ],
      });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content =
      response.choices[0].message.content;
    fs.writeFile(promptset + '/responses/response_mistral7b.html', content, (err) => {
      if (err) throw err;
      console.log('Mistral 7b finetuned response saved to response_mistral7b.html');
      console.log(`Mistral 7b finetuned response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Mistral response:', error.message);
  }
}
async function getResponseMistralSmall() {
  try {
    const startTime = Date.now();
    const response = await mistral.chat.complete({
        model: "ft:mistral-small-latest:229c75b9:20241019:b88083c6",
        messages: [
            {
                content: 'You are a code conversion assistant. Attribute with the correct attributes and return ONLY full html, no truncation (so including repetitive content) and nothing else. Attributes: textfield-[varName], textarea-[varName], list-[varName], img-[varName], link-[varName], checkbox-[varName], description="[description]."',
                role: "system",
            },
          {
            content: prompt,
            role: "user",
          },
        ],
      });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content =
      response.choices[0].message.content;
    fs.writeFile(promptset + '/responses/response_mistralsmall.html', content, (err) => {
      if (err) throw err;
      console.log('Mistral small finetuned response saved to response_mistralsmall.html');
      console.log(`Mistral small finetuned response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Mistral response:', error.message);
  }
}
async function getResponseMistralNemo() {
  try {
    const startTime = Date.now();
    const response = await mistral.chat.complete({
        model: "ft:open-mistral-nemo:229c75b9:20241019:cd2e6611",
        messages: [
            {
                content: 'You are a code conversion assistant. Attribute with the correct attributes and return ONLY full html, no truncation (so including repetitive content) and nothing else. Attributes: textfield-[varName], textarea-[varName], list-[varName], img-[varName], link-[varName], checkbox-[varName], description="[description]."',
                role: "system",
            },
          {
            content: prompt,
            role: "user",
          },
        ],
      });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content =
      response.choices[0].message.content;
    fs.writeFile(promptset + '/responses/response_mistralnemo.html', content, (err) => {
      if (err) throw err;
      console.log('Mistral nemo finetuned response saved to response_mistralnemo.html');
      console.log(`Mistral nemo finetuned response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Mistral response:', error.message);
  }
}

async function getResponseMistralNemoBase() {
  try {
    const startTime = Date.now();
    const response = await mistral.chat.complete({
        model: "mistral-small-latest",
        messages: [
          {
            content: prompt,
            role: "user",
          },
        ],
      });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content =
      response.choices[0].message.content;
    fs.writeFile(promptset + '/responses/response_mistral7b.html', content, (err) => {
      if (err) throw err;
      console.log('Mistral 7b finetuned response saved to response_mistral7b.html');
      console.log(`Mistral 7b finetuned response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Mistral response:', error.message);
  }
}

async function getResponseMistralLarge() {
  try {
    const startTime = Date.now();
    const response = await mistral.chat.complete({
        model: "ft:mistral-large-latest:229c75b9:20241020:05ee3c56",
        messages: [
            {
                content: 'You are a code conversion assistant. Attribute with the correct attributes and return ONLY full html, no truncation (so including repetitive content) and nothing else. Attributes: textfield-[varName], textarea-[varName], list-[varName], img-[varName], link-[varName], checkbox-[varName], description="[description]."',
                role: "system",
            },
          {
            content: prompt,
            role: "user",
          },
        ],
      });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content =
      response.choices[0].message.content;
    fs.writeFile(promptset + '/responses/response_mistrallarge.html', content, (err) => {
      if (err) throw err;
      console.log('Mistral nemo finetuned response saved to response_mistrallarge.html');
      console.log(`Mistral nemo finetuned response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Mistral response:', error.message);
  }
}

getResponseMistralNemoBase();
/*
getResponseGPT4o();
getResponseGPT4omini();
getResponseMistral7B();
getResponseMistralSmall();
getResponseMistralNemo();
getResponseMistralLarge();*/
